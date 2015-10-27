package org.swtk.commons.dict.wordnet.index.name.instance.d.r.i.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDRIB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"drib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13793544\"]}");
	add("{\"term\":\"dribble\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00479658\", \"05424022\", \"07447159\"]}");
	add("{\"term\":\"dribbler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10053388\", \"10053613\"]}");
	add("{\"term\":\"dribbling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00479658\"]}");
	add("{\"term\":\"driblet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13793544\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }