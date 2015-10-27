package org.swtk.commons.dict.wordnet.index.name.instance.f.l.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flow\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"13534950\", \"08478606\", \"14029377\", \"13503533\", \"00330053\", \"15302716\", \"07420493\"]}");
	add("{\"term\":\"flowage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01260222\", \"09305440\", \"13503783\"]}");
	add("{\"term\":\"flowchart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06594261\"]}");
	add("{\"term\":\"flower\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15320288\", \"11689786\", \"11690372\"]}");
	add("{\"term\":\"flowerbed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03373198\"]}");
	add("{\"term\":\"floweret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11690237\"]}");
	add("{\"term\":\"flowering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13592420\", \"13460743\"]}");
	add("{\"term\":\"flowerpot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03997420\"]}");
	add("{\"term\":\"flowing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07420493\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }