package org.swtk.commons.dict.wordnet.index.name.instance.b.r.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBROM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bromberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09005644\"]}");
	add("{\"term\":\"brome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12131295\"]}");
	add("{\"term\":\"bromegrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12131295\"]}");
	add("{\"term\":\"bromelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12628478\"]}");
	add("{\"term\":\"bromeliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12627668\"]}");
	add("{\"term\":\"bromeosin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15012043\"]}");
	add("{\"term\":\"bromide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07168754\", \"14809784\"]}");
	add("{\"term\":\"bromine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14656307\"]}");
	add("{\"term\":\"bromoform\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14644727\"]}");
	add("{\"term\":\"bromus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12131147\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }