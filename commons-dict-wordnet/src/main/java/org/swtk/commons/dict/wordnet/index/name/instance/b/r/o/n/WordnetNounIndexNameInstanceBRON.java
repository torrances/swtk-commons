package org.swtk.commons.dict.wordnet.index.name.instance.b.r.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bronc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02383397\"]}");
	add("{\"term\":\"bronchiole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05539299\"]}");
	add("{\"term\":\"bronchiolitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14169941\"]}");
	add("{\"term\":\"bronchitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14169755\"]}");
	add("{\"term\":\"broncho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02383397\"]}");
	add("{\"term\":\"bronchodilator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02908937\"]}");
	add("{\"term\":\"bronchopneumonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14171713\"]}");
	add("{\"term\":\"bronchoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02909211\"]}");
	add("{\"term\":\"bronchospasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00227378\"]}");
	add("{\"term\":\"bronchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05539144\"]}");
	add("{\"term\":\"bronco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02383397\"]}");
	add("{\"term\":\"broncobuster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09903082\"]}");
	add("{\"term\":\"bronte\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10885154\", \"10885287\", \"10885447\"]}");
	add("{\"term\":\"brontosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01712125\"]}");
	add("{\"term\":\"brontosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01712125\"]}");
	add("{\"term\":\"bronx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09142656\"]}");
	add("{\"term\":\"bronze\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02909500\", \"14741436\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }