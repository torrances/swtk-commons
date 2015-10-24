package org.swtk.commons.dict.wiktionary.generated.n.e.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNEA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("near", "{\"term\":\"near\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"Danish\", \"English\", \"middle english (1100-1500)\", \"old high german (ca. 750-1050)\", \"Dutch\", \"old norse\", \"old frisian\", \"Swedish\"], \"text\":\"From Middle english (1100-1500) \u0027nere\u0027 \u0027ner\u0027 () from Old english (ca. 450-1100) \u0027nēar\u0027 (nearer) {{l|en|nigh|\u0026quot;nigh\u0026quot;}}|lang\u003dang}}, influenced by Old norse \u0027nær\u0027 both originating from Proto-germanic {{m|gem-pro|*nēhwiz||nearer}}, comparative of the adverb {{m|gem-pro|*nēhw||near}}. Cognate with Old frisian \u0027niār\u0027 (nearer) Dutch \u0027naar\u0027 (to, towards) Old high german (ca. 750-1050) {{m|goh|nāhōr||nearer}}, Danish \u0027når\u0027 (when) Swedish \u0027när\u0027 (when)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The left side of a horse or of a team of horses pulling a carriage etc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nearsightedness", "{\"term\":\"nearsightedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|nearsighted|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of being nearsighted, myopia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }