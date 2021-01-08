        Context ctx = PIMContextFactory.getContext(USERNAME, PASSWORD, COMPANY_NAME);
        SpecManager manager = ctx.getSpecManager();
        PrimarySpec pSpec = (PrimarySpec)manager. createSpec("New Primary Spec", Spec.Type. PRIMARY_SPEC);
        AttributeDefinition pkNode = pSpec. createAttributeDefinition(specName + "/PK", 0);
        pSpec.setPrimaryKey(specName + "/PK");
        pSpec.save();

        Context ctx = PIMContextFactory.getContext(USERNAME, PASSWORD, COMPANY_NAME);
        SpecManager manager = ctx.getSpecManager();
        Spec secSpec = manager.createSpec("New Secondary Spec", Spec.Type.SECONDARY_SPEC);
        AttributeDefinition node1 = secSpec.createAttributeDefinition(specName + "/PK", 0);
        secSpec.save();

        String subSpecName = "New Sub Spec";
        Context m_ctx = PIMContextFactory.getContext(USERNAME, PASSWORD, COMPANY_NAME);
        SpecManager manager = m_ctx.getSpecManager();
        Spec subSpec = manager.createSpec(subSpecName, Spec.Type.SUB_SPEC);
        AttributeDefinition node1 = subSpec.createAttributeDefinition(subSpecName + "/attr1", 0);
        subSpec.save();