package org.swtk.commons.dict.wordnet.index.name.instance.c.o.p.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOPY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"copy\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06688854\", \"06402155\", \"03109245\", \"06517508\"]}");
	add("{\"term\":\"copybook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06427565\"]}");
	add("{\"term\":\"copycat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09983941\"]}");
	add("{\"term\":\"copyhold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13263821\"]}");
	add("{\"term\":\"copyholder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03109739\"]}");
	add("{\"term\":\"copying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01021466\"]}");
	add("{\"term\":\"copyist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09984335\"]}");
	add("{\"term\":\"copyreader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09984189\"]}");
	add("{\"term\":\"copyright\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06484839\"]}");
	add("{\"term\":\"copywriter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09984551\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }