package DemoTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.AlrFrmWin;
import Base.MainPage;
import Base.Tstbse;
import Base.Wdgts;
import Base.Wdgts2;
import Base.practiceForm;

public class TestDemo extends Tstbse{
	@BeforeMethod
	public void setUp() {
		initial();
	}
	@Test
	public void tstbx() throws InterruptedException {
		MainPage tb = new MainPage();
		tb.TextBox("user","user@gmail.com","TestAddress","TestAddress");
	}
	@Test
	public void rdbtn() throws InterruptedException {
		MainPage rb = new MainPage();
		rb.RadioButton();
	}
	@Test
	public void Wbtbl() throws InterruptedException {
		MainPage wt = new MainPage();
		wt.WebTable("fn","ln", "u@gmail.com", "23","13000","QA");
	}
	@Test
	public void btns() throws InterruptedException {
		MainPage bn = new MainPage();
		bn.Buttons();
	}
	@Test
	public void upld() throws InterruptedException {
		MainPage ud = new MainPage();
		ud.Upload();
	}
	@Test
	public void pracForm() throws InterruptedException {
		practiceForm pf = new practiceForm();
		pf.form("Palavalasa", "Jagadeesh", "jj@gmail.com","987654321", 
				 
				"Vijayawada");
	}
	@Test
	public void AFW() {
		AlrFrmWin afm = new AlrFrmWin();
		afm.Alerts("Your Name");
	}
	@Test
	public void Wid() throws InterruptedException {
		Wdgts wd = new Wdgts();
		wd.Prgrsbr();
		wd.Accordian();
		wd.AutoComp();
	}
	@Test
	public void Wid1() throws InterruptedException {
		Wdgts2 wd1 =  new Wdgts2();
		wd1.DatePick();
	}
	
	
	@AfterMethod
	public void End(){
		fiinal();
	}

}
