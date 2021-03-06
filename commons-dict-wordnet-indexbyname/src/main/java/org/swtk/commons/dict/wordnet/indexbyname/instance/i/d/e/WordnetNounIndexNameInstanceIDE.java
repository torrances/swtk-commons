package org.swtk.commons.dict.wordnet.indexbyname.instance.i.d.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIDE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"idea\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07042734\", \"05811387\", \"05846174\", \"05991800\", \"05842164\"]}");
	add("{\"term\":\"ideal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10344909\", \"05932328\"]}");
	add("{\"term\":\"ideal gas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14940663\"]}");
	add("{\"term\":\"ideal solid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13939032\"]}");
	add("{\"term\":\"idealisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01221565\", \"05933040\", \"13516839\"]}");
	add("{\"term\":\"idealism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04877838\", \"05159943\", \"05980970\"]}");
	add("{\"term\":\"idealist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10216584\"]}");
	add("{\"term\":\"ideality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04862755\"]}");
	add("{\"term\":\"idealization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05933040\", \"13516839\", \"01221565\"]}");
	add("{\"term\":\"idealogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10726461\"]}");
	add("{\"term\":\"ideation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05792704\"]}");
	add("{\"term\":\"identical twin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10216801\"]}");
	add("{\"term\":\"identicalness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04750264\"]}");
	add("{\"term\":\"identification\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04625938\", \"05770995\", \"14600591\", \"06898133\", \"00152838\"]}");
	add("{\"term\":\"identification particle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14940336\"]}");
	add("{\"term\":\"identifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07285306\"]}");
	add("{\"term\":\"identikit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03564711\"]}");
	add("{\"term\":\"identikit picture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03564711\"]}");
	add("{\"term\":\"identity\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04750264\", \"13808960\", \"05771409\", \"04625427\"]}");
	add("{\"term\":\"identity card\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06489042\"]}");
	add("{\"term\":\"identity crisis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14398768\"]}");
	add("{\"term\":\"identity element\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13808960\"]}");
	add("{\"term\":\"identity matrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08286178\"]}");
	add("{\"term\":\"identity operator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13808960\"]}");
	add("{\"term\":\"identity parade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08448162\"]}");
	add("{\"term\":\"identity theft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00778566\"]}");
	add("{\"term\":\"identity verification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06435918\"]}");
	add("{\"term\":\"ideogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06853698\"]}");
	add("{\"term\":\"ideograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06853698\"]}");
	add("{\"term\":\"ideography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06373579\"]}");
	add("{\"term\":\"ideological barrier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05699457\"]}");
	add("{\"term\":\"ideologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10217011\"]}");
	add("{\"term\":\"ideologue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10217011\"]}");
	add("{\"term\":\"ideology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05787565\", \"06222574\"]}");
	add("{\"term\":\"ides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15199021\"]}");
	add("{\"term\":\"idesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12400822\"]}");
	add("{\"term\":\"idesia polycarpa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12400822\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }