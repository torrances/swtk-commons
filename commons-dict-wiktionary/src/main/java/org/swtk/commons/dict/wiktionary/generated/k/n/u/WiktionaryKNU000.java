package org.swtk.commons.dict.wiktionary.generated.k.n.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKNU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("knucklebones", "{\"term\":\"knucklebones\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a game with similarities to jacks and dice\", \"priority\":1}]}, \"synonyms\":{}}");

	add("knucklehead", "{\"term\":\"knucklehead\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An idiot; a stupid or inept perso\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Don\u0027t stick that screwdriver into the live electrical outlet, you \u0027\u0027knucklehead\", \"priority\":2}]}, \"synonyms\":{}}");

	add("knurl", "{\"term\":\"knurl\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"{{suffix|knur|le|t2\u003ddiminutive|lang\u003den}}, from Middle english (1100-1500) \u0027knar\u0027 (knot in wood) earlier sense “a stone”, of {{unk.|en}} origin.\u0026lt;ref\u0026gt;{{R:Online Etymology Dictionary|gnarled}}\u0026lt;/ref\u0026gt;\u0027gnarl\u0027 is a later variant, from \u0027gnarled\u0027 via \u0027knurled\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A contorted knot in wood\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A crossgrained protuberance; a nodule; a boss or projection\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A lined or crossgrained pattern of ridges or indentations rolled or pressed into a part for grip\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }