package org.swtk.commons.dict.wordnet.indexbyname.instance.e.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"embalmer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071023\"]}");
	add("{\"term\":\"embalmment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00822067\"]}");
	add("{\"term\":\"embankment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03286971\"]}");
	add("{\"term\":\"embargo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06673265\"]}");
	add("{\"term\":\"embarkation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00059157\"]}");
	add("{\"term\":\"embarkment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00059157\"]}");
	add("{\"term\":\"embarrassment\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05127416\", \"07320169\", \"14009674\", \"07522337\"]}");
	add("{\"term\":\"embassador\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09806975\"]}");
	add("{\"term\":\"embassy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08419785\", \"03287206\"]}");
	add("{\"term\":\"embayment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09238571\"]}");
	add("{\"term\":\"embellishment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00263586\", \"03287312\", \"07187630\"]}");
	add("{\"term\":\"ember\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09296036\"]}");
	add("{\"term\":\"emberiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01540351\"]}");
	add("{\"term\":\"emberizidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01539557\"]}");
	add("{\"term\":\"embezzlement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00778229\"]}");
	add("{\"term\":\"embezzler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071145\"]}");
	add("{\"term\":\"embiodea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02186005\"]}");
	add("{\"term\":\"embioptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02186005\"]}");
	add("{\"term\":\"embiotocidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02573279\"]}");
	add("{\"term\":\"embitterment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14012356\"]}");
	add("{\"term\":\"emblem\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06893714\", \"03287502\"]}");
	add("{\"term\":\"embodiment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00934815\", \"05949928\", \"10438047\"]}");
	add("{\"term\":\"embolectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00674477\"]}");
	add("{\"term\":\"embolism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14124565\", \"15197711\"]}");
	add("{\"term\":\"embolus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14396812\"]}");
	add("{\"term\":\"embonpoint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05008078\"]}");
	add("{\"term\":\"embossment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04080781\", \"06868482\"]}");
	add("{\"term\":\"embothrium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12236899\"]}");
	add("{\"term\":\"embouchure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03800320\"]}");
	add("{\"term\":\"embrace\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00181619\", \"14450812\", \"00418410\"]}");
	add("{\"term\":\"embracement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00418410\"]}");
	add("{\"term\":\"embracing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00418410\"]}");
	add("{\"term\":\"embrasure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03991266\"]}");
	add("{\"term\":\"embrocation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03678920\"]}");
	add("{\"term\":\"embroiderer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071360\"]}");
	add("{\"term\":\"embroideress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071491\"]}");
	add("{\"term\":\"embroidery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03287844\", \"07187630\"]}");
	add("{\"term\":\"embroilment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13959186\"]}");
	add("{\"term\":\"embryo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01461483\", \"11706972\"]}");
	add("{\"term\":\"embryologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071569\"]}");
	add("{\"term\":\"embryology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06080976\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }