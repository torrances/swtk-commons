package org.swtk.commons.dict.wordnet.index.name.instance.r.o.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROSE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rose\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04978580\", \"07909228\", \"12640957\"]}");
	add("{\"term\":\"roseau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08781220\"]}");
	add("{\"term\":\"rosebay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12265167\"]}");
	add("{\"term\":\"rosebud\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10558717\", \"11695476\"]}");
	add("{\"term\":\"rosebush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12640957\"]}");
	add("{\"term\":\"rosefish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02647447\", \"07808093\"]}");
	add("{\"term\":\"rosehip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12641307\"]}");
	add("{\"term\":\"roselle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12200149\"]}");
	add("{\"term\":\"rosellinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12987884\"]}");
	add("{\"term\":\"rosemaling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04116796\"]}");
	add("{\"term\":\"rosemary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07836121\", \"12884920\"]}");
	add("{\"term\":\"roseola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14345380\"]}");
	add("{\"term\":\"rosette\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04117272\", \"13182896\", \"14305051\", \"04116993\"]}");
	add("{\"term\":\"rosewood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12542693\", \"12542998\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }