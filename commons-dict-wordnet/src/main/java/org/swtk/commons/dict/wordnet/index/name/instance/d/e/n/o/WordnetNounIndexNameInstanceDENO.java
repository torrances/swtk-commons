package org.swtk.commons.dict.wordnet.index.name.instance.d.e.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDENO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"denomination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06350278\", \"08023431\", \"08163789\"]}");
	add("{\"term\":\"denominationalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06208443\", \"06215756\"]}");
	add("{\"term\":\"denominator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13755206\"]}");
	add("{\"term\":\"denotation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05931581\", \"07245708\"]}");
	add("{\"term\":\"denotatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06616169\"]}");
	add("{\"term\":\"denouement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06756562\", \"07307786\"]}");
	add("{\"term\":\"denouncement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07247648\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }