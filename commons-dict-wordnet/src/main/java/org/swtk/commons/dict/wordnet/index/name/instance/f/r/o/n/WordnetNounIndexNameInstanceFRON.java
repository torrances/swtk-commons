package org.swtk.commons.dict.wordnet.index.name.instance.f.r.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFRON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"frond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13175289\"]}");
	add("{\"term\":\"front\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"08481612\", \"08643655\", \"08660207\", \"11480887\", \"14538093\", \"10133352\", \"03403382\", \"05949020\", \"08591221\", \"08591019\"]}");
	add("{\"term\":\"frontage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03318278\", \"13850156\", \"05131200\"]}");
	add("{\"term\":\"frontal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03318278\", \"03403865\", \"03404494\"]}");
	add("{\"term\":\"frontbencher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10133131\"]}");
	add("{\"term\":\"frontier\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06007230\", \"08518135\", \"08522423\"]}");
	add("{\"term\":\"frontiersman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10132841\"]}");
	add("{\"term\":\"frontierswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10133018\"]}");
	add("{\"term\":\"frontispiece\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03404306\", \"03404415\"]}");
	add("{\"term\":\"frontlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03404494\"]}");
	add("{\"term\":\"frontstall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03009223\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }