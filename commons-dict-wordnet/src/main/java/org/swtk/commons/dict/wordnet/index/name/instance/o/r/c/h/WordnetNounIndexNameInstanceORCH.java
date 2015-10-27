package org.swtk.commons.dict.wordnet.index.name.instance.o.r.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORCH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"orchard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03468764\"]}");
	add("{\"term\":\"orchestia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01995719\"]}");
	add("{\"term\":\"orchestiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01995589\"]}");
	add("{\"term\":\"orchestra\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03858698\", \"08265078\"]}");
	add("{\"term\":\"orchestration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01010743\", \"00941634\", \"07052361\"]}");
	add("{\"term\":\"orchestrator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10400799\"]}");
	add("{\"term\":\"orchid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12061915\"]}");
	add("{\"term\":\"orchidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12060212\"]}");
	add("{\"term\":\"orchidales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12059993\"]}");
	add("{\"term\":\"orchidalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14352983\"]}");
	add("{\"term\":\"orchidectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00688166\"]}");
	add("{\"term\":\"orchiectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00688166\"]}");
	add("{\"term\":\"orchil\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13009332\", \"15013997\"]}");
	add("{\"term\":\"orchiopexy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00690439\"]}");
	add("{\"term\":\"orchis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05532266\", \"12063913\"]}");
	add("{\"term\":\"orchitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14374499\"]}");
	add("{\"term\":\"orchotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00690555\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }