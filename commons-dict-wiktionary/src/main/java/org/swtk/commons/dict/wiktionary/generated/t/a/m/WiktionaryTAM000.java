package org.swtk.commons.dict.wiktionary.generated.t.a.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTAM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tamas", "{\"term\":\"tamas\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the three gunas in Hindu philosophy, representing things that are inert, resistant, or dark and destructive\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamagoyaki", "{\"term\":\"tamagoyaki\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"Japanese \u0027卵焼き\u0027 literally \u0026quot;grilled egg\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Japanese omelette made by rolling together several layers of cooked egg, usually prepared in a rectangular pan\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamahaq", "{\"term\":\"tamahaq\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The only known Northern Tuareg language, spoken in Algeria, western Libya, and northern Niger\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamarin", "{\"term\":\"tamarin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of a family of squirrel-sized South American monkeys\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamarind", "{\"term\":\"tamarind\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"old french (842-ca. 1400)\"], \"text\":\"Old french (842-ca. 1400) \u0027tamarinde\u0027 from Arabic \u0027تَمْر هِنْدِيّ\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tropical tree\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The fruit of this tree; the pulp is used as spice in Asian cooking and in Worcestershire sauce\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Other similar species\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"a rainforest tree of Eastern Australia\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Garcinia gummi-gutta\u0027, native to Indonesia\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"species of\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A dark brown colour, like that of a tamarind\", \"priority\":7}]}, \"synonyms\":{}}");

	add("tamasheq", "{\"term\":\"tamasheq\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A southern Tuareg (Berber) language spoken primarily in Mali\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamazight", "{\"term\":\"tamazight\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"central atlas tamazight\"], \"text\":\"Central atlas tamazight {{m|tzm|ⵜⴰⵎⴰⵣⵉⵖⵜ}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The continuum of closely-related Berber languages spoken in Morocco, Algeria, Libya, and other parts of northern Africa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Sometimes used to designate a specific dialect of the Moroccan Middle Atlas\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tambourinist", "{\"term\":\"tambourinist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tambourine|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who plays the tambourine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamelessness", "{\"term\":\"tamelessness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tameless|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being tameless\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tameness", "{\"term\":\"tameness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tame|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being tame\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The result or product of being tame\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tameside", "{\"term\":\"tameside\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A metropolitan borough of Greater Manchester, England\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tametraline", "{\"term\":\"tametraline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A catecholamine reuptake inhibitor, the parent of a series of chemical compounds that eventually led to the development of sertraline\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamibarotene", "{\"term\":\"tamibarotene\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An orally-active synthetic retinoid, developed to overcome all-trans retinoic acid (ATRA) resistance, with potential antineoplastic activity\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tamilian", "{\"term\":\"tamilian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Tamil|ian|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a person of Tamil ethnicity\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }