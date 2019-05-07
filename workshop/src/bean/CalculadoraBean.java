package bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.ToggleEvent;

import model.Calculadora;

@ManagedBean(name="calculadora")
@ViewScoped
public class CalculadoraBean {

	private Calculadora calculadora = new Calculadora();
	
	public Calculadora getCalculadora() {
		return calculadora;
	}
	
	public int getNumero1() {
		return calculadora.getNumero1();
	}
	
	public int getNumero2() {
		return calculadora.getNumero2();
	}
	
	public void setNumero1(int num1) {
		this.calculadora.setNumero1(num1);
	}
	
	public void setNumero2(int num2) {
		this.calculadora.setNumero2(num2);
	}
	
	public void remover(Integer resultado) {
		this.getResultados().remove(resultado);
	}
	
	public void somar() {
		this.getCalculadora().soma();
	}
	
	public List<Integer> getResultados(){
		return this.calculadora.getResultados();
	}
	
	public void handleToggle(ToggleEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled",
				"Visibility:" + event.getVisibility());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
