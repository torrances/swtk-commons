package org.swtk.commons.dict.wordnet.index.name.instance.t.h.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thing\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"00002452\", \"07495496\", \"05993067\", \"04624646\", \"04431553\", \"06736657\", \"05679169\", \"07304554\", \"04431353\", \"05863569\", \"00034778\", \"13967020\"]}");
	add("{\"term\":\"thingamabob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"thingamajig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"thingmabob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"thingmajig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"things\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13267231\"]}");
	add("{\"term\":\"thingumabob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"thingumajig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"thingummy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"think\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05794377\"]}");
	add("{\"term\":\"thinker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10728103\", \"10727941\"]}");
	add("{\"term\":\"thinking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05778923\"]}");
	add("{\"term\":\"thinner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14859503\"]}");
	add("{\"term\":\"thinness\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04944023\", \"05122081\", \"05144243\", \"05008647\", \"05110948\"]}");
	add("{\"term\":\"thinning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00363878\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }