class HRunner{
public static void main(String[] args){

String customername="Vardhan";
String patientname="Mawra";
String mobile="9742639172";
String email="abc@outlook.in";
String sickness="Cough";
int age=26;
Hospital.checkup(patientname,mobile,email,sickness,age);
Nurse.assist(customername);
}
}