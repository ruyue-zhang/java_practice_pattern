package com.thoughtworks;

public class App {

  public static void main(String[] args) {

    MemoryRepository<Student> mem = new MemoryRepository<>();
    mem.save("3", new Student("3", "张三") );
    mem.save("4", new Student("4", "李四") );
    mem.save("5", new Student("5", "王五") );
    mem.save("6", new Student("6", "赵六") );
    mem.save("7", new Student("7", "钱七") );

    System.out.println(mem.get("3").toString() );
    System.out.println("-------------------------");
    mem.delete("4");
    mem.update("5", new Student("5", "冯五") );
    RepositoryUtil.printList(mem.list() );
  }
}
