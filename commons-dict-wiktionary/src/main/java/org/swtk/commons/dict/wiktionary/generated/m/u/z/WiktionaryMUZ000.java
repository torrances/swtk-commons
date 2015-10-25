package org.swtk.commons.dict.wiktionary.generated.m.u.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMUZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("muzzle", "{\"term\":\"muzzle\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\"], \"text\":\"From earlier {{m|en|muzle}}, {{m|en|musle}}, {{m|en|mousle}}, {{m|en|mussel}}, {{m|en|mozell}}, from Middle english (1100-1500) {{m|enm|mosel}}, from Old french (842-ca. 1400) {{m|fro|musel}}, {{m|fro|museau}}, {{m|fro|muzeau}} (modern French {{m|fr|museau}}), from {{m|la|mūsellum}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The protruding part of many animal\u0027s head which includes nose, mouth and jaws; snou\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The mouth or the end for entrance or discharge of a gun, pistol etc., that the bullet emerges from as opposed to the breech\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A device used to prevent animal from biting or eating, which is worn on its snout\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A piece of the forward end of the plow-beam by which the traces are attached; bridl\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"An openwork covering for the nose, used for the defense of the horse, and forming part of the bards in the 15th and 16th centuries\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }