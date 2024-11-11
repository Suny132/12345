package utils;

import java.util.List;

public class PageUtils {

    // 计算偏移量
    public static int calculateOffset(int page, int size) {
        return (page - 1) * size;
    }

    // 创建分页数据结构
    public static <T> Page<T> createPage(List<T> list, int page, int size) {
        int total = list.size();
        int offset = calculateOffset(page, size);
        int toIndex = Math.min(offset + size, total);

        List<T> pageList = list.subList(offset, toIndex);
        return new Page<>(page, size, total, pageList);
    }

    // 分页对象
    public static class Page<T> {
        private int page;
        private int size;
        private int total;
        private List<T> data;

        public Page(int page, int size, int total, List<T> data) {
            this.page = page;
            this.size = size;
            this.total = total;
            this.data = data;
        }

        public int getPage() {
            return page;
        }

        public int getSize() {
            return size;
        }

        public int getTotal() {
            return total;
        }

        public List<T> getData() {
            return data;
        }
    }
}
