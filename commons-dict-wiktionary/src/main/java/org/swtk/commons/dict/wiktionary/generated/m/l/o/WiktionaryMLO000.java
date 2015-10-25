package org.swtk.commons.dict.wiktionary.generated.m.l.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMLO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mlolongo", "{\"term\":\"mlolongo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|sw|mlolongo||queuing, lining up|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A system of voting held in Kenya during the w:Keny\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Moi era where voters would line up behind their favored candidates contrary to a secret ballot.Category:en:Voting systemsCategory:Kenyan English\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }