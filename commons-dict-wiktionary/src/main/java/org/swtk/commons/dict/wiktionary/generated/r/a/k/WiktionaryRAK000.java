package org.swtk.commons.dict.wiktionary.generated.r.a.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("rakfisk", "{\"term\":\"rakfisk\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Norwegian\"], \"text\":\"Norwegian {{l|no|rakfisk}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Norwegian delicacy consisting of raw trout fermented after being packed moist with salt.Category:en:Salmonids\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rakija", "{\"term\":\"rakija\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"Serbo-Croatian\", \"Turkish\"], \"text\":\"From Serbo-croatian \u0027rakija\u0027 \u0027sc\u003dcyrl\u0027 from Turkish probably from Arabic \u0027عَرَق\u0027 (sweat or wine) (as rakija or wine vapor drops are similar to drops of sweat). The exact etymology is hard to pinpoint as this word (or a variant of it) is found throughout the Balkans, the Mediterranean and the Middle East.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A strong distilled alcoholic beverage made from various fruits, varieties of which (such as slivovitz) are found across the Balkans and the Mediterranean\", \"priority\":1}]}, \"synonyms\":{}}");

	add("raków", "{\"term\":\"raków\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Polish\"], \"text\":\"From the Polish {{m|pl|Raków}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A settlement founded in the of in 1569 as the centre of the , the site of the 1602–1638 and of the publication of the \u0027\u0027 in 1605; a town until 1869, a village of the Republic of and the seat of the \u0027\u0027 (rural commune) of the same name\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A \u0027gmina wiejska\u0027 (rural commune) in in the of the Republic of Poland, with its seat in the village of the same name\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }