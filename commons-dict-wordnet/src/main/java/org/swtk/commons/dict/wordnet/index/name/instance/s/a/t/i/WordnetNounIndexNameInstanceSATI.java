package org.swtk.commons.dict.wordnet.index.name.instance.s.a.t.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSATI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"satiation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01074908\", \"14475617\"]}");
	add("{\"term\":\"satie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11302424\"]}");
	add("{\"term\":\"satiety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14475617\"]}");
	add("{\"term\":\"satin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04145344\"]}");
	add("{\"term\":\"satinet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04145481\"]}");
	add("{\"term\":\"satinette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04145481\"]}");
	add("{\"term\":\"satinleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12794677\"]}");
	add("{\"term\":\"satinpod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11912010\"]}");
	add("{\"term\":\"satinwood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12718275\", \"12718469\", \"12736168\"]}");
	add("{\"term\":\"satire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06790003\"]}");
	add("{\"term\":\"satirist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572170\"]}");
	add("{\"term\":\"satisfaction\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01074489\", \"13371012\", \"13313810\", \"14010164\", \"07546643\"]}");
	add("{\"term\":\"satisfactoriness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04799358\"]}");
	add("{\"term\":\"satisfier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09447367\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }