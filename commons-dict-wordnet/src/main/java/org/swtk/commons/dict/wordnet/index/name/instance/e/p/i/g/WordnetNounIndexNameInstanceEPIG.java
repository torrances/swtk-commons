package org.swtk.commons.dict.wordnet.index.name.instance.e.p.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEPIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"epigaea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12255430\"]}");
	add("{\"term\":\"epigastrium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05403414\"]}");
	add("{\"term\":\"epigenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13496275\"]}");
	add("{\"term\":\"epiglottis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05309251\"]}");
	add("{\"term\":\"epiglottitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14368957\"]}");
	add("{\"term\":\"epigon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10081850\"]}");
	add("{\"term\":\"epigone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10081850\"]}");
	add("{\"term\":\"epigram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07168435\"]}");
	add("{\"term\":\"epigraph\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06418190\", \"06625693\"]}");
	add("{\"term\":\"epigraphy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06155504\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }