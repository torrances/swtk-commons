package org.swtk.commons.dict.wiktionary.generated.b.i.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBIK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bikh", "{\"term\":\"bikh\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hindi\"], \"text\":\"Hindi {{rfscript|hi|sc\u003dDeva}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A virulent poison extracted from or other species of aconite\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The plant itself\", \"priority\":2}]}, \"synonyms\":{}}");

	add("biker", "{\"term\":\"biker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who rides a bicycle, a cyclist\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person whose lifestyle is centered on motorcycles, sometimes a member of an outlaw motorcycle club\", \"priority\":2}]}, \"synonyms\":{}}");

	add("bikeporn", "{\"term\":\"bikeporn\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027bike\u0027 + \u0027porn\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Images of bicycles, and associated equipment, in a style meant to arouse feelings of appreciation and envy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bikeshedding", "{\"term\":\"bikeshedding\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|bikeshed|ing|lang\u003den}}. The term was coined as a metaphor to illuminate w:Parkinson\u0027s Law of Triviality|Parkinson’s Law of Triviality. Parkinson observed that a committee whose job is to approve plans for a nuclear power plant may spend the majority of its time on relatively unimportant but easy-to-grasp issues, such as what materials to use for the staff bikeshed, while neglecting the design of the power plant itself, which is far more important but also far more difficult to criticize constructively. It was popularized in the {{w|Berkeley Software Distribution}} community by Poul-Henning Kamp\u0026lt;ref name\u003d\u0026quot;phk-bikeshed\u0026quot;\u0026gt;[http://phk.freebsd.dk/sagas/bikeshed.html The bikeshed email], Poul-Henning Kamp, web page (undated)\u0026lt;/ref\u0026gt; and has spread from there to the software industry at large.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Futile investment of time and energy in discussion of marginal technical issues\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Procrastination\", \"priority\":2}]}, \"synonyms\":{}}");

	add("bikewear", "{\"term\":\"bikewear\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|bike|wear|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Clothes intended to be worn while riding a bicycle\", \"priority\":1}]}, \"synonyms\":{}}");

	add("biking", "{\"term\":\"biking\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The sport of riding a bicycle\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Professional \u0027\u0027biking\u0027\u0027 is plagued with controversies over drug use\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }