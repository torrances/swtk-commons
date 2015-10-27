package org.swtk.commons.dict.wordnet.index.name.instance.a.b.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09610392\", \"10826801\"]}");
	add("{\"term\":\"abelard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10826921\"]}");
	add("{\"term\":\"abele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12752769\"]}");
	add("{\"term\":\"abelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12692412\"]}");
	add("{\"term\":\"abelmoschus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12192267\"]}");
	add("{\"term\":\"abelmosk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12192998\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }