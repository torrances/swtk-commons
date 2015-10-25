package org.swtk.commons.dict.wiktionary.generated.v.o.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVOX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("voxel", "{\"term\":\"voxel\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|volumetric|element|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the three-dimensional analogue of a pixel; a volume element representing some numerical quantity, such as the colour, of a point in three-dimensional space, used in the visualisation and analysis of three-dimensional (especially scientific and medical) data\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }