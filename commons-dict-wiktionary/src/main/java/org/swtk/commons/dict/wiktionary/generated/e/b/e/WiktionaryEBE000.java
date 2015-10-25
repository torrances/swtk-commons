package org.swtk.commons.dict.wiktionary.generated.e.b.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEBE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ebene", "{\"term\":\"ebene\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"yanomamö\"], \"text\":\"Yanomamö lt;!--Yanomaman--\u0026gt;{{etystub|en}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A psychoactive material, obtained from plants of the genus , used ritually as snuff by the Yanomamo people of South America\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ebenezer", "{\"term\":\"ebenezer\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hebrew\"], \"text\":\"From Hebrew \u0027אֶבֶן הָעֵזֶר\u0027 (stone of help)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The stone memorial in Israel erected by Samuel\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Then Samuel took a stone, and set it between Mizpeh and Shen, and called the name of it \u0027\u0027Ebenezer\u0027\u0027, saying, Hitherto hath the LORD helped us\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"taken up by Puritans in the 17th century\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1843\u0027\u0027 w:Charles Charles Dickens, \u0027s:A Christmas A Christmas Carol\u0027, Stave 1\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;I have none to give,\u0026quot; the Ghost replied. \u0026quot;It comes from other regions, \u0027\u0027Ebenezer\u0027\u0027 Scrooge, and is conveyed by other ministers, to other kinds of men.\u0026quot\", \"priority\":5}]}, \"synonyms\":{}}");

	add("ebeye", "{\"term\":\"ebeye\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\", \"Marshallese\"], \"text\":\"From a misspelling of German \u0027lang\u003dde\u0027 from Marshallese \u0027lang\u003dmh\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Ebeye, Kwajalein atoll\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }