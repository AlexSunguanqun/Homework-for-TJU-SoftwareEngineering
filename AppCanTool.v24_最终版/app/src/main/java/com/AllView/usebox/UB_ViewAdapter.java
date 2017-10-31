package com.AllView.usebox;

import java.util.ArrayList;


import com.AllView.device.D_Element;
import com.view.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * TreeViewAdapter
 * @author carrey
 *
 */
public class UB_ViewAdapter extends BaseAdapter {
	private ArrayList<D_Element> elementsData;
	private ArrayList<D_Element> elements;
	private LayoutInflater inflater;
	private int indentionBase;
	
	public UB_ViewAdapter(ArrayList<D_Element> elements, ArrayList<D_Element> elementsData, LayoutInflater inflater) {
		this.elements = elements;
		this.elementsData = elementsData;
		this.inflater = inflater;
		indentionBase = 50;
	}
	
	public ArrayList<D_Element> getElements() {
		return elements;
	}
	
	public ArrayList<D_Element> getElementsData() {
		return elementsData;
	}
	
	@Override
	public int getCount() {
		return elements.size();
	}

	@Override
	public Object getItem(int position) {
		return elements.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.act_item_treeview, null);
			holder.disclosureImg = (ImageView) convertView.findViewById(R.id.disclosureImg);
			holder.contentText = (TextView) convertView.findViewById(R.id.contentText);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		D_Element element = elements.get(position);
		int level = element.getLevel();
		holder.disclosureImg.setPadding(
				indentionBase * (level + 1), 
				holder.disclosureImg.getPaddingTop(), 
				holder.disclosureImg.getPaddingRight(), 
				holder.disclosureImg.getPaddingBottom());
		holder.contentText.setText(element.getContentText());
		if (element.isHasChildren() && !element.isExpanded()) {
			holder.disclosureImg.setImageResource(R.drawable.close);
			holder.disclosureImg.setVisibility(View.VISIBLE);
		} else if (element.isHasChildren() && element.isExpanded()) {
			holder.disclosureImg.setImageResource(R.drawable.open);
			holder.disclosureImg.setVisibility(View.VISIBLE);
		} else if (!element.isHasChildren()) {
			holder.disclosureImg.setImageResource(R.drawable.close);
			holder.disclosureImg.setVisibility(View.INVISIBLE);
		}
		return convertView;
	}
	static class ViewHolder{
		ImageView disclosureImg;
		TextView contentText;
	}
}
