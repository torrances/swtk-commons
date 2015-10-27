package org.swtk.commons.dict.wordnet.index.name.instance.c.a.s.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCASH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cash\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10905974\", \"13407638\", \"13407787\"]}");
	add("{\"term\":\"cashbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02980398\"]}");
	add("{\"term\":\"cashcard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13397816\"]}");
	add("{\"term\":\"cashew\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07788123\", \"12780033\"]}");
	add("{\"term\":\"cashier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09918741\", \"10718466\"]}");
	add("{\"term\":\"cashmere\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08997987\", \"15129236\", \"02980789\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }