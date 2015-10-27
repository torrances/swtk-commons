package org.swtk.commons.dict.wordnet.index.name.instance.t.e.r.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTERC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"terce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15254671\"]}");
	add("{\"term\":\"tercel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01608818\"]}");
	add("{\"term\":\"tercelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01608818\"]}");
	add("{\"term\":\"tercentenary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15276568\"]}");
	add("{\"term\":\"tercentennial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15276568\"]}");
	add("{\"term\":\"tercet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766184\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }