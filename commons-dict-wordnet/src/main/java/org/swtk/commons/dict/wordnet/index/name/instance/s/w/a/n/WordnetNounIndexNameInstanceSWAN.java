package org.swtk.commons.dict.wordnet.index.name.instance.s.w.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSWAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"swan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01861082\"]}");
	add("{\"term\":\"swanflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12075542\"]}");
	add("{\"term\":\"swank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04820943\"]}");
	add("{\"term\":\"swanneck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12075542\"]}");
	add("{\"term\":\"swansea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08915998\"]}");
	add("{\"term\":\"swanson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11346428\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }