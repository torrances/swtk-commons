package org.swtk.commons.dict.wordnet.index.name.instance.m.o.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOTH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02285853\"]}");
	add("{\"term\":\"mothball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03794236\"]}");
	add("{\"term\":\"mother\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05843616\", \"10352574\", \"10352666\", \"15131241\", \"10352098\"]}");
	add("{\"term\":\"motherese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07170239\"]}");
	add("{\"term\":\"motherfucker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09834593\"]}");
	add("{\"term\":\"motherhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13836253\"]}");
	add("{\"term\":\"motherland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08527190\"]}");
	add("{\"term\":\"motherliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04880153\"]}");
	add("{\"term\":\"motherwell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11213918\"]}");
	add("{\"term\":\"motherwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12872229\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }