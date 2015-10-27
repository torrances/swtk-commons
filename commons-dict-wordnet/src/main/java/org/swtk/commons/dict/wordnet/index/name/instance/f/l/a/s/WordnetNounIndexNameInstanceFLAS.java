package org.swtk.commons.dict.wordnet.index.name.instance.f.l.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flash\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"03363018\", \"03363226\", \"06695239\", \"06887980\", \"06902380\", \"15271921\", \"05816450\", \"07301793\", \"04960363\", \"07426692\"]}");
	add("{\"term\":\"flashback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07358313\", \"06413169\"]}");
	add("{\"term\":\"flashboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03363439\"]}");
	add("{\"term\":\"flashboarding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03363439\"]}");
	add("{\"term\":\"flashbulb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03363018\"]}");
	add("{\"term\":\"flashcard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06806816\"]}");
	add("{\"term\":\"flasher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02855432\", \"03363687\", \"10090749\"]}");
	add("{\"term\":\"flashflood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11475509\"]}");
	add("{\"term\":\"flashgun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03363018\"]}");
	add("{\"term\":\"flashiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04825931\"]}");
	add("{\"term\":\"flashing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03363854\", \"07301793\"]}");
	add("{\"term\":\"flashlight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03363983\"]}");
	add("{\"term\":\"flashover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11474887\"]}");
	add("{\"term\":\"flashpoint\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05020993\", \"08603857\", \"14057284\"]}");
	add("{\"term\":\"flask\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13789286\", \"03364412\"]}");
	add("{\"term\":\"flaskful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13789286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }