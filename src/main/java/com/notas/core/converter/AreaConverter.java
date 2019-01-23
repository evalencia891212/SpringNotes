package com.notas.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.notas.core.entity.Area;
import com.notas.core.model.MArea;

@Component("areaConverter")
public class AreaConverter {
	
	public List<MArea> ConvertirLista(List<Area> areas)
	{
		List<MArea> mareas = new ArrayList<>();
		for(Area area : areas)
		{
			mareas.add(new MArea(area));
		}
		return mareas;
	}
	
}
