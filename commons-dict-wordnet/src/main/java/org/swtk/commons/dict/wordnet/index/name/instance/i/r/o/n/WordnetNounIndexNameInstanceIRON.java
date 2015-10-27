package org.swtk.commons.dict.wordnet.index.name.instance.i.r.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIRON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iron\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03589998\", \"03590506\", \"03590242\", \"14666595\"]}");
	add("{\"term\":\"ironclad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03590720\"]}");
	add("{\"term\":\"ironing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00582127\", \"03591044\"]}");
	add("{\"term\":\"ironist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572170\"]}");
	add("{\"term\":\"ironman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10236230\"]}");
	add("{\"term\":\"ironmonger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03499012\", \"10236360\"]}");
	add("{\"term\":\"ironmongery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03591800\"]}");
	add("{\"term\":\"irons\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03590607\"]}");
	add("{\"term\":\"ironside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10236509\"]}");
	add("{\"term\":\"ironsides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10935857\"]}");
	add("{\"term\":\"ironware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03498893\"]}");
	add("{\"term\":\"ironweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12052396\"]}");
	add("{\"term\":\"ironwood\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"12308522\", \"12337813\", \"12338004\", \"12391066\"]}");
	add("{\"term\":\"ironwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03591929\"]}");
	add("{\"term\":\"ironworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10236598\"]}");
	add("{\"term\":\"ironworks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03592080\"]}");
	add("{\"term\":\"irony\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07120931\", \"04722351\", \"06790003\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }