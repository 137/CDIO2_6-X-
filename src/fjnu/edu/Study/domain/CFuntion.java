/**
 * 
 */
package fjnu.edu.Study.domain;




/**
 * @author Administrator
 * 
 */
public class CFuntion implements Comparable<CFuntion>{

	private String functionName;// 函数名
	private String functionType;// 函数类型
	private String functionPrototype;// 函数原型
	private String functionUsage;// 函数用法
	private String functionRole;// 函数功能
	private String functionIntroduction;// 函数说明
	private String functionExameple;// 函数实例

	public CFuntion() {
		super();
	}

	public CFuntion(String functionName, String functionType,
			String functionPrototype, String functionUsage,
			String functionRole, String functionIntroduction,
			String functionExameple) {
		super();
		this.functionName = functionName;
		this.functionType = functionType;
		this.functionPrototype = functionPrototype;
		this.functionUsage = functionUsage;
		this.functionRole = functionRole;
		this.functionIntroduction = functionIntroduction;
		this.functionExameple = functionExameple;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionType() {
		return functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public String getFunctionPrototype() {
		return functionPrototype;
	}

	public void setFunctionPrototype(String functionPrototype) {
		this.functionPrototype = functionPrototype;
	}

	public String getFunctionUsage() {
		return functionUsage;
	}

	public void setFunctionUsage(String functionUsage) {
		this.functionUsage = functionUsage;
	}

	public String getFunctionRole() {
		return functionRole;
	}

	public void setFunctionRole(String functionRole) {
		this.functionRole = functionRole;
	}

	public String getFunctionIntroduction() {
		return functionIntroduction;
	}

	public void setFunctionIntroduction(String functionIntroduction) {
		this.functionIntroduction = functionIntroduction;
	}

	public String getFunctionExameple() {
		return functionExameple;
	}

	public void setFunctionExameple(String functionExameple) {
		this.functionExameple = functionExameple;
	}

	@Override
	public String toString() {
		
		return "functionName:" + this.functionName + "\nfunctionType:"
				+ this.functionType + "\nfunctionprototype:"
				+ this.functionPrototype + "\nfunctionUsage:"
				+ this.functionUsage + "\nfunctionRole:" + this.functionRole
				+ "\nfunctionIntroduction:" + this.functionIntroduction
				+ "\nfunctionExample:" + this.functionExameple;
	}
	
	
	
	public int compareTo(CFuntion o) {

		if (!this.functionType.equals(o.functionType)) {
			return this.functionType.compareTo(o.functionType);
		} else if(!this.functionName.equals(o.functionName)){
			return this.functionName.compareTo(o.functionName);
		}

		return 0;
	}
	
	

}
