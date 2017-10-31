package _01_Iterator;

/*ͼ�����ģʽ��һ��ʾ������
 * ����2017��09/20
 * ���ߣ����ڈ�
 * 
 * ����ϵĵ�������
 */
public class BookShelfIterator implements Iterator{
	//����
	private BookShelf bookshelf;
	private int index;
	
	//����
	//���췽������Ҫָ�������ĵ����������ĸ�����ϵġ�
	//���ҽ�index��ʼ��Ϊ0������������������ܵĵ�һ��Ԫ��λ��֮ǰ��λ��
	public BookShelfIterator(BookShelf bookshelf){
		this.bookshelf = bookshelf;
		this.index = 0;
	}
	//�������Ϊ�Ƿ���Ե���next������
	
	@Override
	public boolean hasNext() {
		if(index<bookshelf.getLength()){
			return true;
		}
		else{
			return false;
		}
		
	}
	//���ص�ǰ��Ԫ�ز���ָ����һ��
	@Override
	public Object next() {
		Book book = bookshelf.getBook(index);
		index++;
		return book;
	}
}
