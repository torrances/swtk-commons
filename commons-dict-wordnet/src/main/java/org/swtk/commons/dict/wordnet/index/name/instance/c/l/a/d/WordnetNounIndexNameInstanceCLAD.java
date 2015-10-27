package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cladding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03320589\"]}");
	add("{\"term\":\"clade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08008750\"]}");
	add("{\"term\":\"cladistics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06162992\"]}");
	add("{\"term\":\"cladode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13150773\"]}");
	add("{\"term\":\"cladogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13935439\"]}");
	add("{\"term\":\"cladonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13011698\"]}");
	add("{\"term\":\"cladoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13011560\"]}");
	add("{\"term\":\"cladophyll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13150773\"]}");
	add("{\"term\":\"cladorhyncus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02038499\"]}");
	add("{\"term\":\"cladrastis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12536545\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }