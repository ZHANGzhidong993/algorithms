import com.alibaba.fastjson.JSON;
import com.myhexin.algorithms.sort.Insertion;
import com.myhexin.algorithms.sort.Merge;
import com.myhexin.algorithms.sort.Selection;
import org.junit.Test;

import java.util.Random;

/**
 * @author zhangzhidong
 * @create: 2018-08-07 23:32
 */
public class SortTest {

    private Comparable[] a = new Comparable[10];

    public SortTest() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println("数组初始化成功：" + JSON.toJSONString(a));
    }

    @Test
    public void testSelection() {
        Selection.sort(a);
        System.out.println("选择排序：" + JSON.toJSONString(a));
    }

    @Test
    public void testInsertion() {
        Insertion.sort(a);
        System.out.println("插入排序：" + JSON.toJSONString(a));
    }

    @Test
    public void testMerge() {
        Merge.sort(a);
        System.out.println("归并排序：" + JSON.toJSONString(a));
    }
}
