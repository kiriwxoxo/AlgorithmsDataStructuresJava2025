package scr;

class Solution {
    //принимает2 начала списков и возвращает началосписка
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temporarily = new ListNode(0);
        
        // current указатель ("курсор") cначала он указывает на временную голову.
        ListNode current = temporarily;

        // Цикл работает пока в ОБОИХ списках еще есть элементы
        while (list1 != null && list2 != null) {
            
            if (list1.val < list2.val) {
                current.next = list1;
                // сдвигаем ук лист1 на 1 вперед
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            // сдвигаем наш курсор на узел,
            current = current.next;
        }


        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return temporarily.next;
    }
}
