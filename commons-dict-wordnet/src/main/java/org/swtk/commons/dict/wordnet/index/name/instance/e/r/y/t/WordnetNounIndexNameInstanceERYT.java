package org.swtk.commons.dict.wordnet.index.name.instance.e.r.y.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceERYT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"erythema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14249785\"]}");
	add("{\"term\":\"erythrina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12548243\"]}");
	add("{\"term\":\"erythrite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14698937\"]}");
	add("{\"term\":\"erythroblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05455833\"]}");
	add("{\"term\":\"erythroblastosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14215238\"]}");
	add("{\"term\":\"erythrocebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02488769\"]}");
	add("{\"term\":\"erythrocin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03300286\"]}");
	add("{\"term\":\"erythrocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05461646\"]}");
	add("{\"term\":\"erythrocytolysin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14930412\"]}");
	add("{\"term\":\"erythroderma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14250700\"]}");
	add("{\"term\":\"erythrolysin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14930412\"]}");
	add("{\"term\":\"erythromycin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03300286\"]}");
	add("{\"term\":\"erythronium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12470604\"]}");
	add("{\"term\":\"erythropoiesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13497314\"]}");
	add("{\"term\":\"erythropoietin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14874504\"]}");
	add("{\"term\":\"erythroxylaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12710402\"]}");
	add("{\"term\":\"erythroxylon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12710569\"]}");
	add("{\"term\":\"erythroxylum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12710569\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }