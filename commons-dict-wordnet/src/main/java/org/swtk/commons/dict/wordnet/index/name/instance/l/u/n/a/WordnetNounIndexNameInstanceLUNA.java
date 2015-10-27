package org.swtk.commons.dict.wordnet.index.name.instance.l.u.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLUNA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"luna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09594427\"]}");
	add("{\"term\":\"lunacy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00513854\", \"14418644\"]}");
	add("{\"term\":\"lunaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11911864\"]}");
	add("{\"term\":\"lunatic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10011068\", \"10296461\"]}");
	add("{\"term\":\"lunation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15232668\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }