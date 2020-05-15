package com.zwy.thrift;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class ThriftClient {
    public static void main(String[] args) {
        TFramedTransport transport = new TFramedTransport(new TSocket("localhost", 8899), 600);
        TCompactProtocol protocol = new TCompactProtocol(transport);
        PersonService.Client client = new PersonService.Client(protocol);

        try {
            transport.open();
            Person person = client.getPersonByUsername("zwy");
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.isMarried());

            System.out.println("----------------");
            Person person2 = new Person();
            person2.setName("zcc");
            person2.setAge(25);
            person2.setMarried(false);
            client.savePerson(person2);
            System.out.println("保存完成");
        }catch (Exception ex){
            throw new RuntimeException(ex.getMessage(),ex);
        } finally {
            transport.close();
        }

    }
}
