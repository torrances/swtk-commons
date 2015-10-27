package org.swtk.commons.dict.wordnet.index.name.instance.g.l.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12437887\"]}");
	add("{\"term\":\"gladdon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12434147\"]}");
	add("{\"term\":\"glade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08558851\"]}");
	add("{\"term\":\"gladfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07542406\"]}");
	add("{\"term\":\"gladiator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10496662\", \"10151335\"]}");
	add("{\"term\":\"gladiola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12437887\"]}");
	add("{\"term\":\"gladiolus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05288951\", \"12437887\"]}");
	add("{\"term\":\"gladness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07542406\"]}");
	add("{\"term\":\"gladsomeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07542406\"]}");
	add("{\"term\":\"gladstone\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03993307\", \"11021664\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }