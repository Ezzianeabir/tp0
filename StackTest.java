

import org.example.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class StackTest {

        private Stack stack;

        @BeforeEach
        public void setUp() {
            stack = new Stack();
        }

        @Test
        public void testPushAndPop() {
            stack.push(5);
            stack.push(10);

            Assertions.assertEquals(10, stack.pop());
            Assertions.assertEquals(5, stack.pop());
        }

        @Test
        public void testPeek() {
            stack.push(5);
            stack.push(10);

            Assertions.assertEquals(10, stack.peek());

            Assertions.assertEquals(2, stack.size());
        }

        @Test
        public void testIsEmptyistrue() {
            Assertions.assertTrue(stack.isEmpty());

        }

        @Test
        public void testIsEmptyisfalse() {

            stack.push(5);
            Assertions.assertFalse(stack.isEmpty());
        }

        @Test
        public void testSize() {
            Assertions.assertEquals(0, stack.size());
            stack.push(5);
            Assertions.assertEquals(1, stack.size());
            stack.push(10);
            Assertions.assertEquals(2, stack.size());
        }
        @Test
        public void testPushWhenStackIsEmpty() {
            // Vérifie que la pile est vide avant d'appeler push
            Assertions.assertTrue(stack.isEmpty());

            // Appelle la méthode push avec un élément
            stack.push(5);

            // Vérifie que la pile n'est plus vide après avoir poussé un élément
            Assertions.assertFalse(stack.isEmpty());
        }

        @Test
        public void testPushWhenStackIsFull() {
            // Remplir la pile jusqu'à ce qu'elle soit saturée
            for (int i = 0; i < Stack.INITIAL_CAPACITY; i++) {
                stack.push(i);
            }

            // Vérifie que la pile n'est pas vide avant d'appeler push
            Assertions.assertFalse(stack.isEmpty());

            // Appelle la méthode push avec un élément supplémentaire, la pile devrait être saturée
            Assertions.assertThrows(IllegalStateException.class, () -> {
                stack.push(42);
               // Assertions.assertEquals(42,stack.peek());
            });
            Assertions.assertEquals(42,stack.peek());
            // Vérifie que la pile n'a pas changé après avoir tenté de pousser un élément supplémentaire
            Assertions.assertFalse(stack.isEmpty());

            Assertions.assertEquals(Stack.INITIAL_CAPACITY, stack.size()); // Vérifie que la taille est toujours la capacité initiale
        }
        @Test
        public void testPopEmptyStack() {
            Assertions.assertThrows(IllegalStateException.class, () -> {
                stack.pop();
            });
        }

        @Test
        public void testPeekEmptyStack() {
            Assertions.assertThrows(IllegalStateException.class, () -> {
                stack.peek();
            });
        }
    }


