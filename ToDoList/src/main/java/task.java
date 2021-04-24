

// Task should have a name, priority, subject, and list of email addresses to follow up. (possibly make them reference another task?
public class Task {
	String taskName;
	int taskPriority;
	String taskSubject;
	String[] taskEmailList;

	// constructor for creating tasks. These are mandatory items. Create another if we want to be able to create a task without one of these.
	public Task(String taskName, int taskPriority, String taskSubject, String[] taskEmailList) {
		super();
		this.taskName = taskName;
		this.taskPriority = taskPriority;
		this.taskSubject = taskSubject;
		this.taskEmailList = taskEmailList;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the taskPriority
	 */
	public int getTaskPriority() {
		return taskPriority;
	}

	/**
	 * @param taskPriority the taskPriority to set
	 */
	public void setTaskPriority(int taskPriority) {
		this.taskPriority = taskPriority;
	}

	/**
	 * @return the taskSubject
	 */
	public String getTaskSubject() {
		return taskSubject;
	}

	/**
	 * @param taskSubject the taskSubject to set
	 */
	public void setTaskSubject(String taskSubject) {
		this.taskSubject = taskSubject;
	}

	/**
	 * @return the taskEmailList
	 */
	public String[] getTaskEmailList() {
		return taskEmailList;
	}

	/**
	 * @param taskEmailList the taskEmailList to set
	 */
	public void setTaskEmailList(String[] taskEmailList) {
		this.taskEmailList = taskEmailList;
	}
	
	
}
