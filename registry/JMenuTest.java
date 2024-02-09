package registry;



    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class JMenuTest extends JFrame 
{
    private static final long serialVersionUID = 1L;
    //--------------------------------------------------------
    /**
     * Конструктор класса
     */
    public JMenuTest() 
    {
        super("Реестр животных");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        // Создание строки главного меню
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню  
        menuBar.add(createFileMenu());
        menuBar.add(createViewMenu());
        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);
        // Открытие окна
        setSize(300, 200);
        setVisible(true);
    }
    //--------------------------------------------------------
    /**
     * Функция создания меню "Файл"
     * @return
     */
    private JMenu createFileMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Файл");
        // Пункт меню "Открыть" с изображением
        // JMenuItem open = new JMenuItem("Открыть", 
        //                      new ImageIcon("images/open.png"));
        // Пункт меню из команды с выходом из программы
        JMenuItem exit = new JMenuItem(new ExitAction());
        // Добавление к пункту меню изображения
        //exit.setIcon(new ImageIcon("images/exit.png"));
        // Добавим в меню пункта open
        //file.add(open);
        // Добавление разделителя
        file.addSeparator();
        file.add(exit);

        // open.addActionListener(new ActionListener()
        //     {
        //         @Override
        //         public void actionPerformed(ActionEvent arg0) {
        //             System.out.println ("ActionListener.actionPerformed : open");
        //         }
        //     });
         return file;
    }
    //--------------------------------------------------------
    // создадим забавное меню
    /**
     * Функция создания меню 
     * @return
     */
    private JMenu createViewMenu()
    {
        // создадим выпадающее меню
        JMenu viewMenu = new JMenu("Действия");
        // меню-флажки
        JMenu create  = new JMenu("Добавить животное в список");
        JMenuItem all_list  = new JMenuItem("Список команд");
        JMenuItem teach = new JMenuItem(new AbstractAction("Обучить новой команде"){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Введите новую команду");
                
            }
        });
        JMenuItem cat = new JMenuItem("Кот");//(new AbstractAction("Кот") {
            // public void actionPerformed(ActionEvent e) {
            //     Cats cat_create = new Cats();
            //     List_animals.getListAnimals().add(cat_create);
            // }
            //}
        JMenuItem dog = new JMenuItem("Собака");
        JMenuItem hamstel = new JMenuItem("Хомяк");
        JMenuItem horse = new JMenuItem("Лошадь");
        JMenuItem camel = new JMenuItem("Вербдюд");
        JMenuItem donkey = new JMenuItem("Осел");

        // меню-переключатели
        // JRadioButtonMenuItem one = new JRadioButtonMenuItem("Одна страница");
        // JRadioButtonMenuItem two = new JRadioButtonMenuItem("Две страницы");
        // организуем переключатели в логическую группу
        // ButtonGroup bg = new ButtonGroup();
        // bg.add(one);
        // bg.add(two);
        // добавим все в меню
        //create.addSeparator();
        create.add(cat);
        create.add(dog);
        create.add(hamstel);
        viewMenu.add(create);
        create.add(horse);
        create.add(camel);
        create.add(donkey);
        viewMenu.add(all_list);
        viewMenu.add(teach);
        // разделитель можно создать и явно
        // viewMenu.add( new JSeparator());
        // viewMenu.add(one);
        // viewMenu.add(two);
        return viewMenu;
    }
    //--------------------------------------------------------
    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    //--------------------------------------------------------
    public static void main(String[] args)
    {
        // Подключение украшений для окон
        //JFrame.setDefaultLookAndFeelDecorated(true);
        new JMenuTest();
    }

}

