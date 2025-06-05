package modules.modules1.dataTypes;

public class DataTypes {
    // ===============================
    // Tipos primitivos (tipos padrões do JAVA)
    // Tipos primitivos são mais leves e eficientes, mas não podem ser usados como objetos.
    // ===============================

    byte myByte = 100;               // 1 byte: -128 a 127
    short myShort = 1000;           // 2 bytes: -32.768 a 32.767
    int myInt = 100000;             // 4 bytes: -2^31 a 2^31-1
    long myLong = 10000000000L;     // 8 bytes: precisa do 'L' no final

    float myFloat = 3.14f;          // 4 bytes: precisa do 'f'
    double myDouble = 3.1415926535; // 8 bytes: mais preciso que float

    char myChar = 'A';              // 2 bytes: representa um caractere Unicode
    boolean myBoolean = true;       // 1 bit: true ou false

    // ===============================
    // Wrapper Classes (Object Types)
    // As Wrapper Classes são versões objeto dos tipos primitivos.
    // Elas permitem:
    // - Trabalhar com APIs genéricas (como List, Map, etc.)
    // - Usar métodos utilitários (ex: Integer.parseInt())
    // - Representar valores nulos (ex: Integer idade = null)
    // - Suporte a autoboxing/unboxing (conversão automática entre primitivo e objeto)
    // ===============================

    Byte myByteObject = Byte.valueOf((byte) 100);
    Short myShortObject = Short.valueOf((short) 1000);
    Integer myIntegerObject = Integer.valueOf(100000);
    Long myLongObject = Long.valueOf(10000000000L);

    Float myFloatObject = Float.valueOf(3.14f);
    Double myDoubleObject = Double.valueOf(3.1415926535);

    Character myCharObject = Character.valueOf('A');
    Boolean myBooleanObject = Boolean.valueOf(true);


    Integer integerObject = 5; // autoboxing (int → Integer)
    int primitiveInteger = integerObject; // unboxing (Integer → int)
}
