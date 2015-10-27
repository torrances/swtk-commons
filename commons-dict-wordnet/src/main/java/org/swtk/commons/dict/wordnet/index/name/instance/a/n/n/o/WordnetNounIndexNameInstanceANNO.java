package org.swtk.commons.dict.wordnet.index.name.instance.a.n.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANNO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"annon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07777587\"]}");
	add("{\"term\":\"annona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11714281\"]}");
	add("{\"term\":\"annonaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11714035\"]}");
	add("{\"term\":\"annotating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00372543\"]}");
	add("{\"term\":\"annotation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00372543\", \"06775984\"]}");
	add("{\"term\":\"annotator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09814451\"]}");
	add("{\"term\":\"announcement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06759293\", \"06738907\"]}");
	add("{\"term\":\"announcer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09814565\", \"09814775\"]}");
	add("{\"term\":\"annoyance\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00419407\", \"05838383\", \"09797978\", \"07533500\", \"14429977\"]}");
	add("{\"term\":\"annoyer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10715051\"]}");
	add("{\"term\":\"annoying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00419407\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }