

	public persona(String _nombre, int _edad){

		nombre=_nombre;
		edad=_edad;
	}

	public persona(String _nombre, int _edad, int _id){

		nombre=_nombre;
		edad=_edad;
		id=_id;
	}

	public void mostrar(){

		System.out.println("Nombre::"+nombre);
		System.out.println("Edad::"+edad);

	}

	public void mostrar2(){

		System.out.println("Nombre::"+nombre);
		System.out.println("Edad::"+edad);
		System.out.println("Edad::"+id);

	}

}
