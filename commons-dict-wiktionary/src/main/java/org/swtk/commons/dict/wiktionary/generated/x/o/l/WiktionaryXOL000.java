package org.swtk.commons.dict.wiktionary.generated.x.o.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryXOL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("xoloitzcuintli", "{\"term\":\"xoloitzcuintli\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"classical nahuatl\"], \"text\":\"Through Spanish from Classical nahuatl {{m|nci|xoloitzcuintli||lit\u003ddog of w:Xolotl|Xolotl}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A breed of dog, the Mexican Hairless\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1991\u0027\u0027, Guillermo García Oropeza, \u0027Perros en las tumbas de Colima‎\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Whoever has petted a hairless dog will verify that these wrinkles are produced by a lack of hair, especially among the pups of the \u0027\u0027xoloitzcuintli\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Eduardo Kac, \u0027Telepresence and bio art: networking humans, rabbits, and robots‎\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The Mexican \u0027\u0027xoloitzcuintli\u0027\u0027 (or xolo) is a likely GFP K-9 breed (fig. 77\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Kent V Flannery, Joyce Marcus, \u0027Excavations at San José Mogote 1: the household archaeology‎\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Owing to its hairless condition, the \u0027\u0027xoloitzcuintli\u0027\u0027 visibly perspires\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }