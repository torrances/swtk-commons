package org.swtk.commons.dict.wordnet.index.name.instance.m.e.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMESS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mess\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"13796604\", \"03756556\", \"07581173\", \"07666401\", \"14432893\", \"14523631\"]}");
	add("{\"term\":\"message\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06611268\", \"06263820\"]}");
	add("{\"term\":\"messaging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06291130\"]}");
	add("{\"term\":\"messenger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10330688\"]}");
	add("{\"term\":\"messiah\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07056151\", \"09560436\", \"09560613\", \"09560771\"]}");
	add("{\"term\":\"messiahship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00596525\"]}");
	add("{\"term\":\"messidor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15202443\"]}");
	add("{\"term\":\"messina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08823653\"]}");
	add("{\"term\":\"messiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04904605\", \"14523631\"]}");
	add("{\"term\":\"messmate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10331173\"]}");
	add("{\"term\":\"messuage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03757081\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }